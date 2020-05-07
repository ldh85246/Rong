import requests
import re

f = open("Data/weather.txt", "w", encoding="UTF-8")

url = 'https://www.weather.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108'
text = requests.get(url).text
# print(text)

# # 모든 province를 출력
# list = re.findall('<province>(.+?)</province>', text)
# print(len(list))
# print(list)

# city, 날짜, 날씨, 최고온도, 최저온도를 출력
list = re.findall('<location wl_ver="3">(.+?)</location>', text, re.DOTALL)
for location in list :
    city = re.findall('<city>(.+?)</city>', location)
    data_list = re.findall('<data>(.+?)</data>', location, re.DOTALL)
    for data in data_list :
        tmEf = re.findall('<tmEf>(.+?)</tmEf>', data)
        if tmEf[0].find("12:00") != -1 :
            wf = re.findall('<wf>(.+?)</wf>', data)
            tmx = re.findall('<tmx>(.+?)</tmx>', data)
            tmn = re.findall('<tmn>(.+?)</tmn>', data)
            print(city, tmEf, wf, tmx, tmn)

            # 도시명, 날짜, 날씨, 최고온도, 최저온도를 파일로 저장
            f.write(city + "/")
            f.write(tmEf + "/")
            f.write(wf + "/")
            f.write(tmx + "/")
            f.write(tmn + "\n")
f.close()
print("파일에 저장했습니다.")