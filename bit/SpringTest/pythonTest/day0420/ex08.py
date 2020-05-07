# # 임의의 수 n을 입력받아 1~n까지의 합을 누적하여 출력
# n = int(input("n을 입력 : "))
# tot = 0
# i = 1
# while i <= n :
#     tot = tot + i
#     i = 1 + 1
#     print(tot)
#
# n = int(input("n을 입력 : "))
# tot = 0
# i = n
# while i >= 1 :
#     tot = tot + i
#     i = i - 1
# print(tot)
#
# n = int(input("n을 입력 : "))
# tot = 0
# for i in range(1, n + 1) :
#     tot = tot + i
#     print(tot)
#
# for i in range(1, 10, 1) :
#     print("hello")
#
# for i in range(1, 10, 1):
#     print()
#
# for i in range(1, 10):
#     print(i, end=" ")
#
# for i in range(10):
#     print(i, end=" ")
# # 0 1 2 3 4 5 6 7 8 9
#
# # 연습) 0~9 사이의 수를 거꾸로 출력해봅니다.(for문 이용)
# for i in range(9, -1, -1) :
#     print(i, end=" ")
#
# for i in reversed(range(0, 10, 1)) :
#     print(i, end=" ")

data = [10, 20, 30, 40, 50]
print(type(data))
for v in data :
    print(v, end=" ")

# data의 요소를 거꾸로 출력해 봅니다.
for i in range(0, len(data), 1):
    print(data[i], end=" ")

for i in range(len(data)-1, -1, -1):
    print(data[i], end=" ")

for i in  reversed(data):
    print(i, end=" ")

print(data)
print(list(reversed(data)))