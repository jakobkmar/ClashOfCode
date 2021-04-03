c = input()
i = int(input())
if i % 2 == 0:
    print("CAN'T")
else:
    print("*" * (i // 2) + c + "*" * (i // 2))
