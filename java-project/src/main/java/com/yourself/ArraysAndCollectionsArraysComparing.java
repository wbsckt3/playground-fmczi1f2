//Arrays comparing

func difference(a, b []int) (diff []int) {
    m := make(map[int]bool)

    for _, i := range b {
        m[i] = true
    }

    for _, i := range a {
        if _, ok := m[i]; !ok {
            diff = append(diff, i)
        }
    }
    return
}

var ar1  = []int{ 1, 2, 4, 3 }
var ar2  = []int{ 1, 2, 3, 4, 5  }
var diff = difference(ar2, ar1)
//diff is [5]

fmt.Println("diff is", diff)
Try it in Playground
