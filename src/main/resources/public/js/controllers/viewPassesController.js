'use strict';

angular.module('spacedOut').controller('viewPassesController', ['$scope' , 'toastr', 'monthlyPassFactory', 'customerFactory', 'vehicleFactory', 
function($scope, toastr, monthlyPassFactory, customerFactory, vehicleFactory){
	
	$scope.getPassList = function(){
		monthlyPassFactory.getMonthlyPasses().then(
			
			function(success) {
				$scope.passList = success.data;
				console.log($scope.passList);
			},
			function(error) {
				$scope.passList = error.data;
			});
	};
	$scope.getPassList();
	
	
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
	
	
	$scope.getVehicleList = function(){
		vehicleFactory.getVehicles().then(
			
			function(success) {
				$scope.vehicleList = success.data;
				console.log($scope.vehicleList);
			},
			function(error) {
				$scope.vehicleList = error.data;
			});
	};
	$scope.getVehicleList();
	
	
}])