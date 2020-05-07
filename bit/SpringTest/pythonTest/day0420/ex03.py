# a, b = 5, 2
#
# print(a + b)
# print(a - b)
# print(a * b)
# print(a / b) # 자바와는 달리 실수형 선언 없이 바로 실수 출력이 가능함
# print(a // b) # 정수형 출력
# print(a % b)
# print(a ** b) # 제곱

# 연습) 2자리 양수를 거꾸로 뒤집어 보세요
# 예) 71  ---> 17
# a, b = 7, 1
# print(b, a)

# a = 71
# print(a % 10, a // 10)


# 비교연산자
# > >= < <= == !=

# a, b = 3, 7
# print(a > b)
# print(a >= b)
# print(a < b)
# print(a <= b)
# print(a == b)
# print(a != b)

# n = input("숫자를 입력하세요==>")
# print(n)


# 연습) 사용자한테 임의의 수 N을 입력받아 그 수가 10과 20 사이의 수 이면 True를 출력하고
# 그렇지 않으면 False를 출력합니다.

# n = input("숫자 입력 : ")
# n = int(n)
# print(10 <= n <= 20)
# print(n >= 10 and n <= 20)

n = 12
# print(int(n >= 100))
print(n >= 10 * n <= 20)
print((n >= 10) * (n <= 20))
print(bool((n >= 10) * (n <= 20)))