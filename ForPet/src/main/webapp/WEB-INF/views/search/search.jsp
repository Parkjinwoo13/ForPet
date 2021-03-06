<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset=UTF-8">
    <title>주소로 장소 표시하기</title>
    <script scr="http://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>

<body>
    <div id="mapContainer">
        <div id="sidecontainer">
            <div id="topmenu">
                <div id="catebutton">
                    <select id='vettype'>
                        <option value=''>동물선택</option>
                        <option value='전체'>전체선택</option>
                        <option value='개'>개</option>
                        <option value='고양이'>고양이</option>
                        <option value='햄스터'>햄스터</option>
                        <option value='기니피그'>기니피그</option>
                        <option value='토끼'>토끼</option>
                        <option value='고슴도치'>고슴도치</option>
                        <option value='기타'>기타동물</option>
                    </select><br />
                </div>
                <div id="searchbar"><input id="keyword"/></div>
            </div>
            <div id="leftresult">

            </div>
        </div>
        <div id="mapcontainer">
            <div id="mapsearch"></div>
            <div id="map" style="width:100%;height:350px;"></div>
        </div>

    </div>

    <script type="text/javascript"
        src="//dapi.kakao.com/v2/maps/sdk.js?appkey=b07dc84ff25c3a3b3cad7f7f4c7e90d9&libraries=services"></script>
    <script>
        var markers = [];
        var lat = 0;
        var lon = 0;

        //현재위치를 기본 설정값으로 변경함 / HTML5의 geolocation으로 사용할 수 있는지 확인합니다 
        if (navigator.geolocation) {

            // GeoLocation을 이용해서 접속 위치를 얻어옵니다
            navigator.geolocation.getCurrentPosition(function (position) {

                lat = position.coords.latitude, // 위도
                    lon = position.coords.longitude; // 경도

            });

        } else { // HTML5의 GeoLocation을 사용할 수 없을때 마커 표시 위치와 인포윈도우 내용을 설정합니다

            lat = 37.500966, // 역삼역 위도
                lon = 127.037540; // 역삼역 경도
        }
        var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
            mapOption = {
                center: new daum.maps.LatLng(lat, lon), // 지도의 중심좌표
                level: 2
                //지도 확대 레벨
            };

        // 지도를 생성합니다    
        var map = new daum.maps.Map(mapContainer, mapOption);

        // 주소-좌표 변환 객체를 생성합니다
        var geocoder = new daum.maps.services.Geocoder();

        // 주소로 좌표를 검색합니다
        geocoder.addressSearch('서울시 강남구 역삼동 역삼로 234', function (result, status) {

            // 정상적으로 검색이 완료됐으면 
            if (status === daum.maps.services.Status.OK) {

                var coords = new daum.maps.LatLng(result[0].y, result[0].x);

                // 결과값으로 받은 위치를 마커로 표시합니다
                var marker = new daum.maps.Marker({
                    map: map,
                    position: coords
                });

                // 인포윈도우로 장소에 대한 설명을 표시합니다
                var infowindow = new daum.maps.InfoWindow({
                    content: '<div style="width:150px;text-align:center;padding:6px 0;">드림동물병원</div>'
                });
                infowindow.open(map, marker);

                // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
                map.setCenter(coords);
            }
        });    
    </script>



</body>

</html>