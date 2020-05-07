# 어떤 수가 홀수인지 짝수인지 판별하여 출력
# a = 3
# if a % 2 == 0:
#     print("짝수")
# else:
#     print("홀수")

# 사용자한테 임의의 수 N을 입력받아 음수인지 양수인지 0인지 판별하여 출력합니다.
n = int(input("숫자 입력 : "))
if n == 0 :
    print("0")
elif n >= 0 :
    print("양수")
else:
    print("음수")

# if n > 0 :
#     print("양수")
# else:
#     if n < 0:
#         print("음수")
#     else:
#         print("0")