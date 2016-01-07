'use strict';

angular.module('spacedOut').controller('viewCustomersController', ['$scope', 'customerFactory', 
function($scope, customerFactory){
	
	$scope.getCustomerList = function(){
		customerFactory.getCustomers().then(
			
			function(success) {
				$scope.customerList = success.data;
				console.log($scope.customerList);
			},
			function(error) {
				$scope.customerList = error.data;
			});
	};
	$scope.getCustomerList();
	
	
}])