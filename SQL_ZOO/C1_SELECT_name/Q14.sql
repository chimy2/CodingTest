select capital, name from world where capital like concat('%', name, '%') and capital != name