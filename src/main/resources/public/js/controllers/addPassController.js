'use strict';

angular.module('spacedOut').controller('addPassController', ['$scope', 'monthlyPassFactory', 'customerFactory', 
	function($scope, monthlyPassFactory, customerFactory){
		
	$scope.monthlyPass = {};
	$scope.monthlyPass.passPrice = '';
	$scope.monthlyPass.customer = {};
	$scope.monthlyPass.customer.customerId = '';
	
	$scope.createMonthlyPass = function() {
		$scope.data = JSON.stringify($scope.monthlyPass);
		monthlyPassFactory.addMonthlyPass($scope.data).then(
				function(success) {
					$scope.result = success;
					
				}, function(error) {
					$scope.result = error;
				});
		};
		
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