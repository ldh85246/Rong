# 연습
# 0~9999 사이의 정수를 입력받아 그 수가 몇자리 수 인지 판별하여 출력

# n = int(input("0~9999 사이의 숫자 입력 : "))

# if n < 10 :
#     print(1)
# elif n < 100 :
#     print(2)
# elif n <1000:
#     print(3)
# else:
#     print(4)

# if 0 <= n <= 9:
#     print(1)
# elif 10 <= n <= 99:
#     print(2)
# elif 100 <= n <= 999:
#     print(3)
# elif 1000 <= n <= 9999:
#     print(4)

# if 0 <= n <= 9:
#     print(1)
# if 10 <= n <= 99:
#     print(2)
# if 100 <= n <= 999:
#     print(3)
# if 1000 <= n <= 9999:
#     print(4)

# n = 0
# while True :
#     print("hello")
#     n = n + 1
#     if n == 3 :
#         break

# 연습
# 사용자한테 정수를 입력받아 그 수가 몇자리 수인지 판별하여 출력(반복문 이용)
n = int(input("숫자 입력"))
cnt = 0;
while True:
    n = n // 10
    cnt = cnt + 1
    if n == 0:
        break
print(cnt)