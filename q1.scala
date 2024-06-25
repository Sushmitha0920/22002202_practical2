def initializeVariables(): (Int,Int,Int,Int,Int,Float,Float,Char)= {
    val i, j, k = 2
    val m, n = 5
    val f = 12.0f
    val g = 4.0f
    val c = 'X'
    (i,j,k,m,n,f,g,c)
}

def expression1(): Int = {
    val (i, j, k, m, n, f, g, c) = initializeVariables()
    k+12*m
}

def expression2(): Int = {
    val (i, j, k, m, n, f, g, c) = initializeVariables()
    m/j
}
def expression3(): Int = {
    val (i, j, k, m, n, f, g, c) = initializeVariables()
    n%j
}
def expression4(): Int = {
    val (i, j, k, m, n, f, g, c) = initializeVariables()
    m/j*j
}
def expression5(): Float = {
    val (i, j, k, m, n, f, g, c) = initializeVariables()
    f+10*5+g
}
def expression6(): Int = {
    val (i, j, k, m, n, f, g, c) = initializeVariables()
    val temp = i+1
    temp*n
}
