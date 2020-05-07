import re   # 내장 라이브러리

db = '''3412    Bob 123
3834  Jonny 333
1248   Kate 634
1423   Tony 567
2567  Peter 435
3567  Alice 535
1548  Kerry 534'''

# # 전화번호와 id를 모두 출력
# r = re.findall('[0-9]+', db)
# print(r)
#
# # 이름만 출력
# names = re.findall('[A-Za-z]+', db)
# print(names)
# names = re.findall('[A-z]+', db)
# print(names)
#
# # 전화번호만 출력
# tel = re.findall('[0-9][0-9][0-9][0-9]', db)
# print(tel)
# # id만 출력
# id = re.findall('[0-9][0-9][0-9]', db)
# print(id)

# tel_list = re.findall("[0-9]{4}", db)
# print(tel_list)

# id_list = re.findall("[0-9]{3}$",db, re.MULTILINE)
# print(id_list)

# 연습) T로 시작하는 이름만 출력
startT = re.findall("T[a-z]+", db)
print(startT)

# 연습) T로 시작하지 않는 이름만 출력
# notT = re.findall("[^T][a-z]+", db)
# notT = re.findall("[ABCDEFGHIJKLMNOPQRSUVWXYZ][a-z]+", db)
notT = re.findall("[A-SU-Z][a-z]+", db)
print(notT)