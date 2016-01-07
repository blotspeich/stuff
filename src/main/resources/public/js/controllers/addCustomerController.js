'use strict';

angular.module('spacedOut').controller('addCustomerController', ['$scope', 'customerFactory', 
	function($scope, customerFactory){
		
		$scope.customer = {};
		$scope.customer.firstName = '';

	$scope.createCustomer = function() {
		$scope.data = JSON.stringify($scope.customer);
		customerFactory.addCustomer($scope.data).then(
				function(success) {
					$scope.result = success;
					
				}, function(error) {
					$scope.result = error;
				});
		};
	
}]);