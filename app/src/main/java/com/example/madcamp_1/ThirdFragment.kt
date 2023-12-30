package com.example.madcamp_1

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.madcamp_1.databinding.FragmentThirdBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.Calendar


class ThirdFragment : Fragment() {

    private var isFabOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentThirdBinding.inflate(inflater, container, false)

        val fabMain = binding.fabMain
        val fabDrawing = binding.fabOptionDrawing
        val fabText = binding.fabOptionText

        fabDrawing.scaleX = 0.3f
        fabDrawing.scaleY = 0.3f

        fabText.scaleX = 0.3f
        fabText.scaleY = 0.3f

        fabMain.setOnClickListener {
            toggleFab(fabMain, fabDrawing, fabText)
        }
        fabDrawing.setOnClickListener{
            Toast.makeText(context, "드로잉 버튼 클릭됨", Toast.LENGTH_SHORT).show()
        }

        fabText.setOnClickListener {
            //Toast.makeText(context, "텍스트 버튼 클릭됨", Toast.LENGTH_SHORT).show()
            startActivity(Intent(activity, TextMemoEditActivity::class.java))

        }
        val itemList : ArrayList<MemoModel> = ArrayList()

        for (i in 1..7) {
            val memo = MemoModel(
                title = "Memo $i",
                date = generateRandomDate()
            )
            itemList.add(memo)
        }

        val adapter = MyMemoAdapter(itemList)
        adapter.notifyDataSetChanged()
        binding.rcvMemo.adapter = adapter
        binding.rcvMemo.layoutManager = GridLayoutManager(requireContext(), 3)

        return binding.root
    }

    private fun toggleFab(fabMain:FloatingActionButton, fabDrawing : FloatingActionButton, fabText : FloatingActionButton){
        val targetScaleClosed = 0.3f
        val targetScaleOpen = 1f

        if (isFabOpen) {
            ObjectAnimator.ofFloat(fabDrawing, "translationY", 0f).apply { start() }
            ObjectAnimator.ofFloat(fabText, "translationY", 0f).apply { start() }
            Log.d("test", "닫기")
            ObjectAnimator.ofPropertyValuesHolder(
                fabDrawing,
                PropertyValuesHolder.ofFloat("scaleX", targetScaleClosed),
                PropertyValuesHolder.ofFloat("scaleY", targetScaleClosed)
            ).apply { start() }

            ObjectAnimator.ofPropertyValuesHolder(
                fabText,
                PropertyValuesHolder.ofFloat("scaleX", targetScaleClosed),
                PropertyValuesHolder.ofFloat("scaleY", targetScaleClosed)
            ).apply { start() }

        //fabMain.setImageResource(R.drawable.icon_contact)

        } else {
            ObjectAnimator.ofFloat(fabDrawing, "translationY", -200f).apply { start() }
            ObjectAnimator.ofFloat(fabText, "translationY", -400f).apply { start() }
            Log.d("test", "열기")
            ObjectAnimator.ofPropertyValuesHolder(
                fabDrawing,
                PropertyValuesHolder.ofFloat("scaleX", targetScaleOpen),
                PropertyValuesHolder.ofFloat("scaleY", targetScaleOpen)
            ).apply { start() }

            ObjectAnimator.ofPropertyValuesHolder(
                fabText,
                PropertyValuesHolder.ofFloat("scaleX", targetScaleOpen),
                PropertyValuesHolder.ofFloat("scaleY", targetScaleOpen)
            ).apply { start() }

        //fabMain.setImageResource(R.drawable.icon_pencil)

        }

        isFabOpen = !isFabOpen
    }

    fun generateRandomDate(): String {
        val calendar = Calendar.getInstance()
        val year = (Math.random() * 10).toInt() + 2020 // 임의의 년도 (2020 ~ 2029)
        val month = (Math.random() * 12).toInt() + 1 // 임의의 월 (1 ~ 12)
        val day = (Math.random() * 28).toInt() + 1 // 임의의 일 (1 ~ 28)

        calendar.set(year, month, day)
        return "${calendar.get(Calendar.YEAR)}-${calendar.get(Calendar.MONTH)}-${calendar.get(Calendar.DAY_OF_MONTH)}"
    }


}