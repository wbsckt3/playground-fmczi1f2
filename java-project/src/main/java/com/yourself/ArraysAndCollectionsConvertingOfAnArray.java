//Converting of an array

let numbers = [ 1, 2, 3, 4, 5 ]
let numbers1 = numbers.map({ $0 * 3 })
//numbers is [ 3, 6, 9, 12, 15 ]

let anyNumbers = ["1", "2", "three"]
let numbers2 = anyNumbers.map{Int($0)}
//numbers2 is [Optional(1), Optional(2), nil]

let numbers3 = anyNumbers.compactMap{Int($0)}
//numbers3 is [1, 2]

print("numbers1 is", numbers1)
print("numbers2 is", numbers2)
print("numbers3 is", numbers3)
Try it in Playground
