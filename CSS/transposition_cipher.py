# author : Mohammed Rizwan
# title : transposition cipher


def transposition(plain_text, keyword):
    column = keyword
    row = len(plain_text)//column + 1
    matrix = [[0 for x in range(column)] for y in range(row)]
    pt = list(plain_text)
    q = 0
    for i in range(row):
        for j in range(column):
            if(q < len(pt)):
                matrix[i][j] = pt[q]
            else:
                matrix[i][j] = '#'
            q+=1
    # print(matrix)

    output_list = []

    for i in range(row):
        for j in range(column):
            if( matrix[j][i] == '#'):
                pass
            else:
                output_list.append(matrix[j][i])

    s = ''
    return s.join(output_list)





def main():
    plain_text = input("Enter Plain Text: ")
    keyword = int(input("Enter Keyword: "))
    output = transposition(plain_text,keyword)
    print("OUTPUT CODE : {}".format(output))

main()
