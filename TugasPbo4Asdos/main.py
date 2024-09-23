def secant_method(x0, x1, tol=0.00001, max_iter=100):
    def f(x):
        return x**2 - 2*x - 3
    
    iteration = 0
    while iteration < max_iter:
        x2 = x1 - f(x1)*(x1 - x0) / (f(x1) - f(x0))
        if abs(x2 - x1) < tol:
            return x2, iteration
        x0, x1 = x1, x2
        iteration += 1
    return x1, iteration

x0, x1 = 2, 4
root, iterations = secant_method(x0, x1)
print(f"Akar Secant: {root}, setelah {iterations} iterasi")

