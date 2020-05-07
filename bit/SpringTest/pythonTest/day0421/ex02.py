# f = open('Data/song.txt', 'r', encoding="UTF-8")
# text = f.readlines()
#
# for line in text :
#     print(line.strip())
# f.close()
# print(text)

# f = open("Data/info.txt", "w", encoding="UTF-8")
# age = 20
# f.write("홍길동\n")
# f.write(str(age) + "\n")
# f.write("서울시 마포구 신수동")

f = open("Data/info.txt", "w", encoding="UTF-8")
age = 20

list = ['이순신\n', str(age) + "\n", '서울시 마포구 신수동']
f.writelines(list)
f.close()