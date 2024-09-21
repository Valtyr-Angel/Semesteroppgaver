
favoritter=["lasagne" ,"budae jiggae" , "momos"] 
spill=["baldurs gate 3", "starfield" , "rocket leauge" ]


def print_list1(liste) :
    print()
    for x in liste:
        print (x)
    print()


def print_list2(liste) :
    print()
    print(*liste, sep='\n')
    print()


print()

print_list1(favoritter)
print_list2(spill)

