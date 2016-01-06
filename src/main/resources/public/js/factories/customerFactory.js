angular.module('spacedOut').factory('customerFactory', ['$http', function($http) {
	return {
		getCustomers : function() {
			return $http.get('/customer');
		},
		getCustomerById : function(customerId){
			return $http.get('/customer/' + customerId);
		}
	}
}])