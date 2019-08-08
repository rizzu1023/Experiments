def BFS(Graph, Goal, Root):
	OPEN = []
	CLOSE = []

	while(1):
		if(Root not in CLOSE):
			CLOSE.append(Root)
		if Root in Graph:
			for i in range(len(Graph[Root])):
				if(Graph[Root][i] not in OPEN):
					OPEN.append(Graph[Root][i])
		

		if(Root != Goal):
			print("OPEN {} ,  CLOSE {}\n".format(OPEN,CLOSE))
		else:
			print("OPEN {} , CLOSE : SUCCESS".format(OPEN))
			break
		Root = OPEN[0]
		del OPEN[0]


	

def main():
	# Graph = { 'A' : ['B','C','D'], 'B' : ['E','F'], 'C' : ['G','H'], 'D' : ['I','J']}
	# Goal = 'F'
	# Root = 'A'

	Graph = { 'A' : ['B', 'E', 'C'],
			  'B' : ['A', 'D', 'E'],
			  'E' : ['D'],
			  'C' : ['A', 'F', 'G'],
			  'D' : ['B'],
			  'F' : ['C'],
			  'G' : ['C']
			}

	Goal = 'G'
	Root = 'A'


	BFS(Graph, Goal, Root)

main()