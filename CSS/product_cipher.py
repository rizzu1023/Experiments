
def substitution(char,key):
	new_li = []
	for i in range(len(char)):
		asci = ord(char[i])+key
		if(asci>122):
			new_li.append(chr(ord(char[i])+key-26))
		elif(asci>90 and asci<97):
			new_li.append(chr(ord(char[i])+key-26))
		else:
			new_li.append(chr(ord(char[i])+key))
	return new_li

def rail_fence(code):
	rf_li = code[::2] + code[1::2]
	output = ''.join(str(i) for i in rf_li)
	print("OUTPUT CODE : {}".format(output))
	

def transpose(code):
	key = int(input("Enter key for transpose : "))
	
	
def matrix_cipher(code):
	key = input("Enter key for matrix_cipher(in alphabate) : ")
	l= len(key)
	



def main():
	char = str(input("Enter a Code : "))
	print("Choose a Cipher Method\n1. RailFence Cipher\n2. Transpose Cipher\n3. Matrix Cipher\n4. Exit\n")
	m = int(input("YOUR CHOICE : "))
	key = int(input("\nEnter key for substitution : "))
	code = substitution(list(char),key)
	if(m==1):
		rail_fence(code)
	elif(m==2):
		#transpose(code)
	elif(m==3):
		matrix_cipher(code)
	elif(m==4):
		exit()
	else:
		print("Select Correct Option")
		main()

main()
