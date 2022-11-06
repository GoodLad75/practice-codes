## input
km_travelled = float(input("Distance Traveled(km): "))
duration = float(input("Duration of Ride(minutes): "))

fd_rate = 60; km_rate = 4.50

## comp via km
km_price = (km_travelled * 4.50) + 60
## comp via min
min_price= 0
if duration % 2 == 0:
    min_price = ((duration / 2) * 4.5) + 60
else:
    min_price = int(((duration - 1) / 2) * 4.5) + 60

if min_price > km_price:
    print("P",(float(min_price)))
else:
    print("P",(float(km_price)))
