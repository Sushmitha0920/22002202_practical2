def initializeVariables(): (Int,Int,Int,Int,Float,Float)= {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    var g = 5.0f
    (a,b,c,d,k,g)
}

def evaluateExpressions(): Unit = {
    var (a, b, c, d, k, g) = initializeVariables()
    b-=1
    var result1 = b * a + c * d
    d -= 1
    println(result1)

    println(a)
    a +=1

    println(-2 * (g-k) + c)

    println(c)
    c +=1

    c += 1
    println(c*a);
    a += 1
} 
