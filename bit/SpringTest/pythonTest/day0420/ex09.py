# def pro() :
#     print("hello")
#
# pro()
#
# def pro(a, b) :
#     print(a)
#     print(b)
#
# pro(2, 3)
#
# # 연습) n을 전달받아 1~n까지의 합을 누적하여 출력하는 함수를 정의하고 호출
# def sum(n) :
#     r = 0
#     for i in range(1, n + 1, 1) :
#         r = r + i
#         print(r)
# sum(10)
#
# def sum(n) :
#     r = 0
#     for i in range(1, n + 1, 1) :
#         r = r + i
#         return r
#
#     tot = sum(10)
#     print(tot)
#
# # 연습) 두 수를 매개변수로 전달받아 그 중에 큰 수를 반환하는 함수를 정의하고 호출
# def max(a, b) :
#     r = a
#     if b > r :
#         r = b
#     return r
# print(max(40, 4))
#
# def max(a, b) :
#     if b > a :
#         a = b
#     return a
# print(max(40, 40))

# # 연습) 4개의 수를 전달받아 그 중에 큰수를 찾아 반환하는 함수를 만들고 호출
# def max(a, b, c, d) :
#     return max(max(max(a, b), c), d)
#
# def max4(a, b, c, d) :
#     return max(max(a,b), max(c,d))
# print(max4(100, 3, 200, 9))

# def pro() :
#     return 10, 20, 30
#
# r = pro()
#     print(r)
#     print(type(r))

# a = [10, 20, 30]
# print(type(a))
# print(a)
#
# print(r[0])
# print(a[0])
#
# a[0] = 100
# # r[0] = 100  #TypeError: 'tuple' object does not support item assignment
# print(a)
# print(r)
#
# a,b,c = pro()
# print(a,b,c)
#
# # 연습) n을 매개변수로 전달받아 1~n까지의 합, n의 제곱, n * 2를 차례로 반환하는 함수를 정의하고 호출
# def multi(n) :
#     tot = 0
#     for i in range(1, n + 1, 1) :
#         tot = tot + i
#
#     return tot, n * n, n * 2
# r = multi(5)
# # r = 15, 25, 10
# print(r)
#
# a = 10, 20, 30
# print(a)
#
# i, j, k = a
# print(i)
# print(j)
# print(k)