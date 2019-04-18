# author : Mohammed Rizwan
# title : caesar cipher

def ceasar(plain_text, keyword):
    new_li = []
    for i in range(len(plain_text)):
        asci = ord(plain_text[i])+keyword
        if(asci>122):
            new_li.append(chr(ord(plain_text[i])+keyword-26))
        elif(asci > 90 and asci < 97):
            new_li.append(chr(ord(plain_text[i])+keyword-26))
        elif(asci == 32):
            new_li.append('')
        else:
            new_li.append(chr(ord(plain_text[i])+keyword))
    return new_li

def listToString(list):
    string = ""
    for i in list:
        string += i
    return string.replace('#',' ')

def main():
    plain_text = input("Enter Plain Text: ")
    keyword = int(input("Enter Keyword: "))
    output = ceasar(plain_text,keyword)
    S_output = listToString(output)
    print("OUTPUT CODE : {}".format(S_output))

main()
