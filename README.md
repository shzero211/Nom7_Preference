# Nom7_Preference   
**메인화면에서 버튼을눌러 앱을선택해서 앱을 실행하는 프로그램**   
#코드구성   
**MainActivity**   
*처음 등장하는 화면,버튼 클릭=onButtoclicked실행    
기능은 AppListActivity 로넘어가서 앱을 고름 startActivityForResult로 결과를 받음,   
그후 이미지 버튼을 누르면 앱실행,여기서 특이한것은 앱을 껏다켜도 데이터 상태를 유지하도록 sharedprefrence를 사용해서 키값에 저장 
   
**AppListActivity**   
*깔려있는앱을 list에 저장해놓는 곳  
   
**AppinfoAdapter**   
*리스트에 넣을 내용   
*viewHolder를 통해 findviewbyid횟수를 줄이고 리스트 item에 이미지와 이름을 저장   
   
