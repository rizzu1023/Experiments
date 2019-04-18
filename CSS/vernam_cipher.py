# author : Mohammed Rizwan
# title : vernam cipher

def vernam(plain_text, keyword):
    text_list = []
    key_list = []
    code_list = []
    alphabat = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
    for i in plain_text:
        if( i in alphabat):
            value = alphabat.index(i)
            text_list.append(value+1)

    for i in keyword:
        if( i in alphabat):
            value = alphabat.index(i)
            key_list.append(value+1)


    res_list = [text_list[i] + key_list[i] for i in range(len(text_list))]
    for j in range(len(res_list)):
        if( res_list[j] > 25):
            res_list[j] = res_list[j]-26


    for i in range(len(res_list)):
        code_list.append(alphabat[res_list[i]-2])

    s = ''
    return s.join(code_list)


def main():
    print("i) Length of plain_text & keyword should be same")
    print("ii) Plain Text & Keyword should be in Capital Letter")
    plain_text = input("Enter Plain Text: ")
    keyword = input("Enter Keyword(string): ")
    output = vernam(plain_text,keyword)
    print("OUTPUT CODE : {}".format(output))

main()
