package cars

const COST_OF_PRODUCTION = 10000
const COST_OF_PRODUCTION_10 = 95000

// CalculateWorkingCarsPerHour calculates how many working cars are
// produced by the assembly line every hour
func CalculateWorkingCarsPerHour(productionRate int, successRate float64) float64 {
	return float64(productionRate) * (successRate/100.0)
}

// CalculateWorkingCarsPerMinute calculates how many working cars are
// produced by the assembly line every minute
func CalculateWorkingCarsPerMinute(productionRate int, successRate float64) int {
    return int(float64(productionRate/60) * (successRate/100))
}

// CalculateCost works out the cost of producing the given number of cars
func CalculateCost(carsCount int) uint {
	return uint(((carsCount/10)*COST_OF_PRODUCTION_10) + ((carsCount%10)*COST_OF_PRODUCTION))
}
