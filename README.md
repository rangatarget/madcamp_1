# A. 팀원
|이름|소속|
|---|---|
|박은수|숙명여자대학교 컴퓨터과학과|
|이형진|카이스트 전산학부|
# B. 개발 환경
|언어|IDE|
|---|---|
|kotlin|Android Studio|
# C. 프로젝트 설명
### 프로젝트 이름 : 연.갤.메
"연.갤.메'는 연락처, 갤러리, 메모장의 약자입니다. "연.갤.메"는 이 3가지 기능을 지원하며 각 기능은 탭 단위로 구성되어 있습니다. 
## Tab1 : 연락처
![KakaoTalk_20240103_204020723_04](https://github.com/rangatarget/madcamp_1/assets/110696075/62b98f63-c0be-4d59-bc4a-dd6f90fa4a9b)
![KakaoTalk_20240103_201413388](https://github.com/rangatarget/madcamp_1/assets/110696075/9cfd9e30-95ca-4fe7-9871-19ae815a005f)

연락처 불러오기 버튼을 터치하면 연락처 권한을 허용한 후, 기기로부터 연락처를 불러옵니다.
각 연락처의 영역을 터치하면 연락처 하단에 전화하기, 문자하기 버튼이 생겨납니다.
전화하기 버튼을 눌러 해당 번호로 전화를 걸 수 있습니다.
문자하기 버튼을 누르면 해당 번호로 문자를 보내는 화면으로 연결됩니다.

## Tab2 : 갤러리
![KakaoTalk_20240103_204020723_03](https://github.com/rangatarget/madcamp_1/assets/110696075/c68fc80d-2111-4ca7-9197-4573422fad42)

갤러리는 기본적으로 가로 3칸의 격자로 구성되어 있습니다. 격자는 아래로 스크롤하여 내릴 수 있습니다. "카메라로 추가하기", "갤러리에서 추가하기" 버튼을 각각 처음 누르면 권한을 요구하는 창이 뜹니다. 권한을 허용하면 사진을 추가할 수 있습니다. 추가한 사진은 격자의 마지막 위치에 배치됩니다. 사진을 클릭하면 큰 화면에서 볼 수 있고, 뒤로가기, 삭제, 회전 버튼이 나타납니다. 뒤로가기 버튼을 누르면 격자화면으로 돌아갑니다. 삭제 버튼을 누르면 해당 사진이 삭제되고 격자 화면으로 돌아갑니다. 회전 버튼을 누를때마다 사진이 오른쪽으로 90도씩 회전합니다. 회전한 상태에서 뒤로가기 버튼을 누르면 그 상태로 사진이 편집되어 저장됩니다.

## Tab3 : 메모장
![KakaoTalk_20240103_204020723](https://github.com/rangatarget/madcamp_1/assets/110696075/c8e6f616-d1f2-4108-b0f3-16899c82a9ad)
![KakaoTalk_20240103_204020723_01](https://github.com/rangatarget/madcamp_1/assets/110696075/d80a6221-be91-495b-ab1a-613445f54319)
![KakaoTalk_20240103_204020723_02](https://github.com/rangatarget/madcamp_1/assets/110696075/44e59a76-a696-4fa9-8b11-fac228a4daf9)


우측 하단의 플로팅 버튼을 누르면 텍스트 메모 추가 버튼, 드로잉 메모 추가 버튼이 올라옵니다. 두 가지의 메모 중 무엇을 추가할 지 선택할 수 있습니다.

텍스트 메모 추가 버튼을 누르면 텍스트 메모 편집 화면으로 이동합니다.
상단의 툴바에서 텍스트 메모의 제목을 작성할 수 있습니다. 작성하지 않을 경우 (제목 없음)으로 저장됩니다.
툴바 아래 영역에서 텍스트 메모의 내용을 작성할 수 있습니다. 
화면의 뒤로가기 버튼, 기기의 백버튼을 누르면 메모가 저장됩니다.

드로잉 메모 추가 버튼을 누르면 드로잉 메모 편집 화면으로 이동합니다.
상단의 툴바에서 드로잉 메모의 제목을 작성할 수 있습니다. 작성하지 않을 경우 (제목 없음)으로 저장됩니다.
툴바 아래 영역에서 드로잉 메모의 내용을 그릴 수 있습니다.
브러쉬 버튼을 터치하면 브러쉬 모드로 변경됩니다. 브러쉬 모드가 선택된 상태에서 한 번 더 브러쉬 버튼을 터치하면 브러쉬의 두께와 색상을 설정할 수 있는 메뉴가 나타납니다. 두께와 색상을 고르고 브러쉬 버튼을 한 번 더 터치하면 메뉴가 사라집니다.
지우개 버튼을 터치하면 지우개 모드로 변경됩니다. 지우개 모드가 선택된 상태에서 한 번 더 지우개 버튼을 터치하면 지우개의 두께를 설정할 수 있는 메뉴가 나타납니다. 두께를 고르고 지우개 버튼을 한 번 더 터치하면 메뉴가 사라집니다.
undo 버튼을 터치하면 획을 취소할 수 있습니다.
redo 버튼을 터치하면 취소한 획을 다시 불러올 수 있습니다.
저장 버튼을 터치하면 그림을 기기의 갤러리에 저장할 수 있습니다.

저장된 메모들은 화면의 리사이클러뷰에 보이게 됩니다. 각 메모를 터치하면 해당 메모를 크게 볼 수 있는 화면으로 넘어갑니다. 
메모 상세 보기 화면의 상단 메뉴에서 다음 기능들을 사용할 수 있습니다.
메모 삭제하기: 메모를 삭제할 수 있습니다.
메모 수정하기: 메모를 수정할 수 있습니다. 이 메뉴를 선택하면 메모 수정 화면으로 넘어갑니다.
이미지 저장하기: 드로잉 메모에만 존재하는 메뉴입니다. 메모를 이미지로 저장할 수 있습니다.
