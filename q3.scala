def normalHour(hours:Int): Double = 250*hours

def otHour(hours:Int): Double = 85*hours

def tax(h1:Int, h2:Int): Double = (normalHour(h1)+otHour(h2))*0.12

def totalSalary(h1:Int, h2:Int): Double = normalHour(h1)+otHour(h2)-tax(h1 = h1,h2 = h2)