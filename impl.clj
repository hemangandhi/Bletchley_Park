;; Brief scm impl of the Enigma.

(define (next-char ch)
  (ascii->char (+ 1 (char->ascii ch))))

;;Makes the rotor list
(define (make-rotor chars)
;;for each char, we prepare a node.
;;the node is bound when it is known if the node is the last one.
  (define (loop acc-hd chs ctr)
    (cond ((nil? chs) '())
          ((nil? (cdr chs)) (cons (cons (car chs) ctr) acc-hd))
	  (else  (let-rec ((v (cons (cons (car chs) ctr) '()))
	                      (rest (loop (if (nil? acc-hd) v acc-hd) (cdr chs) (next-char ctr))))
		   (set-cdr! v rest) ;ugh... state.
		   v))))
  (loop '() chs #\a))

(define (search-rotor rot what where)
  (define

;;Prepares both pointers

