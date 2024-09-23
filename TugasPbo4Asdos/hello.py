def fixed_point_iteration(x0, tol=0.00001, max_iter=100):
    def g(x):
        return (x**2 - 4) / 3
    
    iteration = 0
    while iteration < max_iter:
        x1 = g(x0)
        if abs(x1 - x0) < tol:
            return x1, iteration
        x0 = x1
        iteration += 1
    return x0, iteration

x0 = 2
root, iterations = fixed_point_iteration(x0)
print(f"Akar yang ditemukan: {root}, setelah {iterations} iterasi")
