(defvar x)  
(defvar y)  
(defvar z)
(defun suma(x y) (+ x y))
(print "Programa que sume dos numeros")  
(print "Dame el valor de x:") 
(SETQ x (READ))
(print "Dame el valor de y:") 
(SETQ y (READ))
(setf r (suma x y))
(print "El resultado de la operacion es: ")
(print r) 
