def income(ticket:Int, people:Int): Int = ticket*people

def cost(ticket:Int, people:Int): Int = (people*3)+500

def grossIncome(ticket:Int, people:Int): Int = income(ticket,people)-cost(ticket,people)