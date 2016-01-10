'use strict';

angular.module('spacedOut').controller('addPassController', ['$scope', 'toastr', 'monthlyPassFactory', 'customerFactory', 'vehicleFactory',
	function($scope, toastr, monthlyPassFactory, customerFactory, vehicleFactory){
		
	$scope.monthlyPass = {};
	$scope.monthlyPass.passPrice = '';
	$scope.monthlyPass.customer = {};
	$scope.monthlyPass.customer.customerId = '';
	$scope.monthlyPass.vehicle = {};
	$scope.monthlyPass.vehicle.vehicleId = '';
	$scope.monthlyPass.expirationDate = '';
	
	$scope.createMonthlyPass = function() {
		$scope.data = JSON.stringify($scope.monthlyPass);
		monthlyPassFactory.addMonthlyPass($scope.data).then(
				function(success) {
					$scope.result = success;
					toastr.success('Monthly Pass Added')
					
				}, function(error) {
					$scope.result = error;
					toastr.error('Invalid entry');
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
					toastr.success('Customer Added')
					
				}, function(error) {
					$scope.result = error;
					toastr.error('Invalid entry');
				});
		};
		
		$scope.vehicle = {};
		$scope.vehicle.vehicleMake = '';
		$scope.vehicle.vehicleModel = '';
		$scope.vehicle.licenseNumber = '';
		$scope.vehicle.licenseState = '';
		$scope.vehicle.vehicleColor = '';

		$scope.createVehicle = function() {
			$scope.data = JSON.stringify($scope.vehicle);
			vehicleFactory.addVehicle($scope.data).then(
					function(success) {
						$scope.result = success;
						toastr.success('Vehicle Added')
						
					}, function(error) {
						$scope.result = error;
						toastr.error('Invalid entry');
					});
			};
	
}]);