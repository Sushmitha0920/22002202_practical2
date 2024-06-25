def initializeVariables(): (Int,Int,Int,Int,Float,Float)= {
    val a = 2
    val b = 3
    val c = 4
    val d = 5
    val k = 4.3f
    val g = 5.0f
    (a,b,c,d,k,g)
}

def evaluateExpressions(): Unit = {
    val (a, b, c, d, k, g) = initializeVariables()
    printf ("%d", (b-1) * a + c *(d-1))
    printf ("%d",a+1)
    printf ("%d",-2 * (g-k) + c)
    printf ("%d",c+1)
    printf ("%d",(c+1)*(a+1));
}