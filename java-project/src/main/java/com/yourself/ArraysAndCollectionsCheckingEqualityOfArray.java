//Checking equality of arrays

let n1 = [ 1, 2, 3 ]
let n2 = [ 1, 2, 3 ]
let n3 = [ 3, 2, 1 ]

let equal1 = n1 == n2
//equal1 is true

let equal2 = n1 == n3
//equal2 is false

let equal3 = n1.elementsEqual(n3)
//equal3 is false

print("equal1 is \(equal1)")
print("equal2 is \(equal2)")
print("equal3 is \(equal3)")
Try it in Playground
