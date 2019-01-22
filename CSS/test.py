li=[[0]*4]*3
l=[['a','c','z','q'],['b','g','e','e'],['q','e','t','f']]
p=0
for i in range(3):
	for j in range(4):
		# print(i,end='')
		li[i][j]=l[p][1]
		p=p+1
		# print(li)
		# print(l[i][j])
	print("\n")

# for k in range()
print(l)
print(li)