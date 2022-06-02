graph = {
    '8' : ['4', '12'],
    '4' : ['2', '6'],
    '6' : ['5'],
    '2' : ['1', '3'],
    '12' : ['10', '14'],
    '14' : ['13', '15'],
    '10' : ['11']
}

visited = set()

def dfs(visited, graph, node):
    if node not in visited:
        print (node)
        visited.add(node)
        for neighbour in graph[node]:
            dfs(visited, graph, neighbour)

dfs(visited, graph, '14')