

book_liste=["The Hobbit", "Farmer Giles of Ham" ,  "The Fellowship of the Ring" , "The Two Towers",  "The Return of the King" , "The Adventures of Tom Bombadil" ,  "Tree and Leaf"] 
print(book_liste[0])
print(book_liste[1])
print(book_liste[5])
print(book_liste[6])



book_liste.append("The Silmarillion" )
book_liste.append("Unfinished Tales") 

#print(book_liste)

book_liste [2] = "Lord of the Rings:The Fellowship of the Ring"
book_liste [3] = "Lord of the Rings: The Two Towers"
book_liste [4] = "Lord of the Rings: The Return of the King"

#print(book_liste)

book_liste.sort()

print(*book_liste, sep=", ")
