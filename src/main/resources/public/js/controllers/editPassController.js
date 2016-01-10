'use strict';

angular.module('spacedOut').controller('editPassController', ['$scope', 'toastr', 'customerFactory', 'monthlyPassFactory', 'vehicleFactory', 
                                                              function($scope, toastr, customerFactory, monthlyPassFactory, vehicleFactory){
	
	$scope.monthlyPass = {};
	$scope.monthlyPass.passPrice = '';
	$scope.monthlyPass.customer = {};
	$scope.monthlyPass.customer.customerId = '';
	$scope.monthlyPass.vehicle = {};
	$scope.monthlyPass.vehicle.vehicleId = '';
	$scope.monthlyPass.expirationDate = '';
	
}])