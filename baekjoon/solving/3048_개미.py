import sys
input = sys.stdin.readline

a, b = map(int, input().split())

ant1 = list(map(str, input().strip()))
ant2 = list(map(str, input().strip()))

time = int(input().strip())

print(a,b)
ant1.reverse()
print(ant1 + ant2)
print(time)

