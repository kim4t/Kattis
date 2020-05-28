import math
n = int(input())
for i in range(n):
   x, y = input().split()
   x = int(x)
   y = int(y)

   h1 = (4*(x+y) + math.sqrt(16 * (math.pow(x+y,2)) - 48*x*y))/24
   h2 = (4*(x+y) - math.sqrt(16 * (math.pow(x+y,2)) - 48*x*y))/24

   if h1>h2:
       a = x-2*h2
       b = y-2*h2
       print(a*b*h2)
   else:
       a = x-2*h1
       b = y-2*h1
       print(a*b*h1)