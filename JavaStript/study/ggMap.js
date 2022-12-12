// const API_cey = 'FC93wWLF8PAM%2BjOJy3XhuFovwU9wi5a0SsUnEKYa63n%2FTikkgkOfbvc212sfQJZjAQ6udo6dFr0VvhrNG5hfTg%3D%3D';
const API_cey = 'AIzaSyDa5eJ7mCSWh-6EsZjnAgXDSl8lQx4lY-A';

async function getData(){
  const url=`http://apis.data.go.kr/B552061/frequentzoneBicycle/getRestFrequentzoneBicycle?ServiceKey=${API_cey}&searchYearCd=2015&siDo=27&guGun=230&type=json&numOfRows=10&pageNo=1`;
  // 해당 url 호출하기
  // await : 데이터가 도착할 때 까지 기다려줘야된당
  const response = await fetch(url);
  const data = await response.json();
  // console.log("data", data);
  // map() : array함수, 배열을 받아서 배열을 반환하는 함수
  // 전달시킬 매개변수값 저장
  const locations = data.items.item.map(spot=>[
    spot.spot_nm, 
    spot.la_crd, 
    spot.lo_crd,
  ]);
  // console.log("locations", locations);
  drawMap(locations);
}

function drawMap(locations){
  /*
  매개변수의 형태
  locations = [
    ["지역이름", 위도, 경도],
    ["지역이름", 위도, 경도]
  ]
  */ 
  // 맵을 생성
  const map = new google.maps.Map(document.getElementById("map"),{
    zoom: 13,
    center: new google.maps.LatLng(locations[0][1], locations[0][2]),
    mapTypeId: google.maps.MapTypeId.ROADMAP,
  });
  const infowindow = new google.maps.InfoWindow();

  let marker, i;

  // 로케이션별로 마크 생성
  for(i = 0; i< locations.length; i++){
    marker = new google.maps.Marker({
      position: new google.maps.LatLng(locations[i][1], locations[i][2]),
      map: map,
    });
  }
  // 마크를 클릭했을때 보여주는 정보
  google.maps.event.addListener(
    marker,
    "click",
    (function(marker, i){
      return function(){
        infowindow.setContent(locations[i][0]);
        infowindow.open(map, marker);
      };
    })(marker,i)
  );
}
getData();