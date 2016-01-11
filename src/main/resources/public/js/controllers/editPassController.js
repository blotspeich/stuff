'use strict';

angular.module('spacedOut').controller('editPassController', ['$scope', 'toastr', 'customerFactory', 'monthlyPassFactory', 'vehicleFactory', 
                                                              function($scope, toastr, customerFactory, monthlyPassFactory, vehicleFactory){
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
	
	
	$scope.monthlyPass = {};
	$scope.monthlyPass.passId = {};
	$scope.monthlyPass.passPrice = '';
	$scope.monthlyPass.customer = {};
	$scope.monthlyPass.customer.customerId = '';
	$scope.monthlyPass.vehicle = {};
	$scope.monthlyPass.vehicle.vehicleId = '';
	$scope.monthlyPass.expirationDate = '';
	
	$scope.editMonthlyPass = function(){
		$scope.data = JSON.stringify($scope.monthlyPass);
		
		monthlyPassFactory.editMonthlyPass($scope.data).then(
				function(success) {
					$scope.result = success;
					toastr.success('Monthly Pass Edited')
				}, function(error){
					$scope.result = error;
					toastr.error('Invalid entry');
				})
	};
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}])