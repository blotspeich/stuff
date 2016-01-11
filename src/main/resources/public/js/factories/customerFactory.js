angular.module('spacedOut').factory('customerFactory', ['$http', function($http) {
	return {
		getCustomers : function() {
			return $http.get('/customer');
		},
		getCustomerById : function(customerId){
			return $http.get('/customer/' + customerId);
		},
		addCustomer : function(customer) {
			return $http.post('/customer', customer);
		},
		editCustomer: function(customer) {
			return $http.put("customer", customer);
		}
	}
}]);