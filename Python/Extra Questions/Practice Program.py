#Practice program

genre = ['Action', 'Drama', 'Romance']
movieNames = [['indiana jones', 'terminator'], ['50 shades of grey', 'imitation game'], ['beauty and the beast']]
movieNamesA = [['Indiana Jones', 'Terminator'], ['50 Shades of Grey', 'Imitation Game'], ['Beauty and The Beast']]
movieStock = [[5, 6], [2, 10], [4]]

print("Enter 'quit!' in Return or Take Out to quit the program")
done = False

while done == False:
    rt = str(input("Enter 'Return' to return a movie and 'Take Out' to take out a movie: "))
    if rt.lower() == 'quit!':
        done = True
        break
    elif rt.lower() == 'return':
        movie = str(input("Enter the name of the movie you want to return: "))
        stock = int(input("Enter the amount you want to return: "))
        for i in range(len(genre)):
            for m in range(len(movieNames[i])):
                if movie == movieNames[i][m]:
                    movieStock[i][m] += 1
                else:
                    doNothing = None
    elif rt.lower() =='take out':
        movie = str(input("Enter the name of the movie you want to return: "))
        stock = int(input("Enter the amount you want to return: "))
        for i in range(len(genre)):
            for m in range(len(movieNames[i])):
                if movie == movieNames[i][m]:
                    movieStock[i][m] -= 1
                else:
                    doNothing = None
    total = [0, 0, 0]
    print("Stock: ")
    for i in range(len(genre)):
        for items in movieStock[i]:
            total[i] += int(items)
        for m in range(len(movieNames[i])):
            print(movieNamesA[i][m] + ':', movieStock[i][m])
        
            
        
        
        
