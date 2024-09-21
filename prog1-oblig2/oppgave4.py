book_liste2=[]

book_liste2.append ("Lord of the Rings: The Fellowship of the Ring")
book_liste2.append ("Lord of the Rings: The Two Towers")
book_liste2.append ("Lord of the Rings: The Return of the King")

#print(book_liste2)

for x in book_liste2:
    print(x)

for book in book_liste2:
    print(f"{book} is in the lord of the rings trilogy ") 

for x in range(len(book_liste2)):
    print(book_liste2[x])

for x in range (1):
    print(*book_liste2, sep=", ")
