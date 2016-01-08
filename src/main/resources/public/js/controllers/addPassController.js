'use strict';

angular.module('spacedOut').controller('addPassController', ['$scope', 'monthlyPassFactory', 'customerFactory', 'vehicleFactory',
	function($scope, monthlyPassFactory, customerFactory, vehicleFactory){
		
	$scope.monthlyPass = {};
	$scope.monthlyPass.passPrice = '';
	$scope.monthlyPass.customer = {};
	$scope.monthlyPass.customer.customerId = '';
	$scope.monthlyPass.vehicle = {};
	$scope.monthlyPass.vehicle.vehicleId = '';
	
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
	$scope.customer.lastName = '';
	$scope.customer.phoneNumber = '';
	$scope.customer.emailAddress = '';

	$scope.createCustomer = function() {
		$scope.data = JSON.stringify($scope.customer);
		customerFactory.addCustomer($scope.data).then(
				function(success) {
					$scope.result = success;
					
				}, function(error) {
					$scope.result = error;
				});
		};
		
		$scope.vehicle = {};
		$scope.vehicle.vehicleMake = '';

		$scope.createVehicle = function() {
			$scope.data = JSON.stringify($scope.vehicle);
			vehicleFactory.addVehicle($scope.data).then(
					function(success) {
						$scope.result = success;
						
					}, function(error) {
						$scope.result = error;
					});
			};
	
}]);