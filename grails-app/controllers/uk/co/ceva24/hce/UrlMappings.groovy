package uk.co.ceva24.hce

class UrlMappings {

    static mappings = {

        "/$controller/$action?/$id?(.$format)?" {}

        '500' view: '/error'
        '404' view: '/notFound'
    }
}