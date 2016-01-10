'use strict';
angular.module('spacedOut')
.config(['$stateProvider', '$urlRouterProvider', 
  function($stateProvider, $urlRouterProvider){

	$urlRouterProvider.otherwise('/viewPasses');

	$stateProvider.state('viewPasses', {
		url: '/viewPasses', 
		templateUrl: 'templates/viewPasses.tpl.html',
		controller: 'viewPassesController'
	}) 
     .state('addPass', {
    	url: '/addPass',
    	templateUrl: 'templates/addPass.tpl.html',
    	controller: 'addPassController'
    })
	.state('editPass', { 
        url: '/editPass',
        templateUrl: 'templates/editPass.tpl.html',
        controller: 'editPassController'
    })
    .state('deletePass', {
    	url: '/deletePass',
    	templateUrl: 'templates/deletePass.tpl.html',
    	controller: 'deletePassController'
    })
    .state('addCustomer', {
    	url: '/addCustomer',
    	templateUrl: 'templates/addPass.tpl.html',
    	controller: 'addPassController'
    })
    .state('viewCustomers', {
    	url: '/viewCustomers',
    	templateUrl: 'templates/viewPasses.tpl.html',
    	controller: 'viewPassesController'
    })
    .state('addVehicle', {
    	url: '/addVehicle',
    	templateUrl: 'templates/addPass.tpl.html',
    	controller: 'addPassController'
    })
    .state('viewVehicles', {
    	url: '/viewVehicles',
    	templateUrl: 'templates/viewPasses.tpl.html',
    	controller: 'viewPassesController'
    });
}]);